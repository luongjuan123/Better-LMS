package scr.main.java.com;

import scr.main.java.com.Schoolar.minilms.model.view.LoginWindow;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Chạy ứng dụng trên Event Dispatch Thread để đảm bảo thread-safety với Swing
        SwingUtilities.invokeLater(() -> {
            new LoginWindow();
        });
    }
}