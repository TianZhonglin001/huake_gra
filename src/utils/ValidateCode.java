package utils;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * ��֤�빤����
 */
public class ValidateCode {

    private int width = 90;//��֤���� Ĭ��ֵ��90
    private int height = 40;//��֤��߶� Ĭ��ֵ��40
    private int codeCount = 4;//��֤�����  Ĭ��ֵ��4
    private int lineCount = 19;//�����߸���  Ĭ��ֵ��19
    private int fontSize = 20;//�����С����
    //�洢session�е�keyֵ Ĭ��ֵ��"validateCode"
    private String sessionKey = "validateCode";

    public ValidateCode() {
    }

    /**
     * @param width    ��֤����
     * @param height   ��֤��߶�
     * @param fontSize �����С����
     */
    public ValidateCode(int width, int height, int fontSize) {
        this.width = width;
        this.height = height;
        this.fontSize = fontSize;
    }

    /**
     * @param width      ��֤����
     * @param height     ��֤��߶�
     * @param fontSize   �����С����
     * @param sessionKey �洢session�е�keyֵ
     */
    public ValidateCode(int width, int height, int fontSize, String sessionKey) {
        this.width = width;
        this.height = height;
        this.fontSize = fontSize;
        this.sessionKey = sessionKey;
    }

    /**
     * @param width      ��֤����
     * @param height     ��֤��߶�
     * @param codeCount  ��֤�����
     * @param fontSize   �����С����
     * @param sessionKey �洢session�е�keyֵ
     */
    public ValidateCode(int width, int height, int codeCount, int fontSize, String sessionKey) {
        this.width = width;
        this.height = height;
        this.codeCount = codeCount;
        this.fontSize = fontSize;
        this.sessionKey = sessionKey;
    }

    /**
     * @param width      ��֤����
     * @param height     ��֤��߶�
     * @param codeCount  ��֤�����
     * @param lineCount  �����߸���
     * @param fontSize   �����С����
     * @param sessionKey �洢session�е�keyֵ
     */
    public ValidateCode(int width, int height, int codeCount, int lineCount, int fontSize, String sessionKey) {
        this.width = width;
        this.height = height;
        this.codeCount = codeCount;
        this.lineCount = lineCount;
        this.fontSize = fontSize;
        this.sessionKey = sessionKey;
    }


    char[] codeSequence = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
            'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    /**
     * �����ȡ��֤��ķ���
     *
     * @param time timeΪʱ��,�����Ļ����Ա��������������֤��
     * @throws IOException
     */
    public void getCode(HttpServletRequest request, HttpServletResponse response) {
        //�����������
        Random r = new Random();
        //����洢��֤�����
        StringBuilder builderCode = new StringBuilder();
        //���廭��
        BufferedImage buffImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        //�õ�����
        Graphics g = buffImg.getGraphics();
        //1.������ɫ,���߿�
        g.setColor(Color.gray);
        g.drawRect(0, 0, width, height);
        //2.������ɫ,����ڲ�
        g.setColor(Color.white);
        g.fillRect(1, 1, width - 2, height - 2);
        //3.���ø�����
        // g.setColor(Color.gray);
        for (int i = 0; i < lineCount; i++) {
            int _R = (int) Math.floor(Math.random() * 256);
            int _G = (int) Math.floor(Math.random() * 256);
            int _B = (int) Math.floor(Math.random() * 256);
            g.setColor(new Color(_R, _G, _B, 255));
            g.drawLine(r.nextInt(width), r.nextInt(width), r.nextInt(width), r.nextInt(width));
        }
        //4.������֤��
        g.setColor(Color.blue);
        //4.1������֤������
        g.setFont(new Font("����", Font.BOLD | Font.ITALIC, fontSize));
        for (int i = 0; i < codeCount; i++) {
            char c = codeSequence[r.nextInt(codeSequence.length)];
            builderCode.append(c);
            g.drawString(c + "", ((width / codeCount) * i + 2), height * 4 / 5);
        }
        try {
            //5.�������Ļ
            ServletOutputStream sos = response.getOutputStream();
            ImageIO.write(buffImg, "png", sos);
            //6.���浽session��
            HttpSession session = request.getSession();
            session.setAttribute("" + sessionKey + "", builderCode.toString());
            //7.��ֹͼ�񻺴档
            response.setHeader("Pragma", "no-cache");
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expires", 0);
            response.setContentType("image/png");
            //8.�ر�sos
            sos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


