package projectPackage;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.TextArea;
import java.net.URL;

public class CrimePopup extends JPanel {

    private static final long serialVersionUID = 1L;

    /**
     * Create the panel.
     */
    public CrimePopup() {
        setLayout(null);
        
        TextArea textArea = new TextArea();
        textArea.setText("신종 마약 사건 3년 뒤,\r\n괴물형사 ‘마석도’(마동석)와 서울 광수대는\r\n배달앱을 이용한 마약 판매 사건을 수사하던 중\r\n수배 중인 앱 개발자가 필리핀에서 사망한 사건이\r\n대규모 온라인 불법 도박 조직과 연관되어 있음을 알아낸다.\r\n\r\n필리핀에 거점을 두고 납치, 감금, 폭행, 살인 등으로\r\n대한민국 온라인 불법 도박 시장을 장악한\r\n특수부대 용병 출신의 빌런 ‘백창기’(김무열)와\r\n한국에서 더 큰 판을 짜고 있는 \r\nIT업계 천재 CEO ‘장동철’(이동휘).\r\n\r\n‘마석도’는 더 커진 판을 잡기 위해\r\n‘장이수’(박지환)에게 뜻밖의 협력을 제안하고\r\n광역수사대는 물론,\r\n사이버수사대까지 합류해 범죄를 소탕하기 시작하는데…\r\n\r\n나쁜 놈 잡는데 국경도 영역도 제한 없다!\r\n업그레이드 소탕 작전! 거침없이 싹 쓸어버린다!");
        textArea.setBounds(272, 29, 354, 272);
        add(textArea);
        
        JButton btnNewButton = new JButton("");
        try {
            btnNewButton.setIcon(new ImageIcon(new URL("https://ohtanis.com/wp-content/uploads/2024/04/crimetown.jpg")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        btnNewButton.setBounds(49, 48, 150, 214);
        add(btnNewButton);
    }
}
