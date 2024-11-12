/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package library.management;


import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class BookLoanReturnUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Library Loan System");
        frame.setSize(1200, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel pnlLoan = new JPanel();
        pnlLoan.setLayout(null);
        tabbedPane.addTab("Mượn trả sách", pnlLoan);
        //table
        String[] columnNames = {"Mã mượn", "Mã độc giả", "Mã sách", "Số lượng mượn", "Ngày mượn", "Ngày hẹn trả", "Ngày trả", "Trạng thái"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0); // 0 là số dòng ban đầu
        JTable table = new JTable(tableModel);
        table.setCellSelectionEnabled(true);
       
        JScrollPane scrollPane = new JScrollPane(table);
        //set up
        scrollPane.setBounds(10, 290, 1166, 362);  // Điều chỉnh vị trí và kích thước của bảng trong pnlLoan
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setBackground(new Color(230, 48, 48));  
        renderer.setForeground(new Color(255, 255, 255));  
        table.setDefaultRenderer(Object.class, renderer);

        pnlLoan.add(scrollPane);
        
        // Labels
        JLabel lblReaderId = new JLabel("Mã độc giả:");
        JLabel lblBookId = new JLabel("Mã sách:");
        JLabel lblReturnAppointmentDate = new JLabel("Ngày hẹn trả:");
        JLabel lblOutputReader = new JLabel();
        JLabel lblOutputBook = new JLabel();
//        JLabel lblHeading = new JLabel("Mượn trả sách");
        // Text fields
        JTextField tfReaderId = new JTextField();
        JTextField tfBookId = new JTextField();
        JTextField tfSearchLoan = new JTextField();
        JTextField tfDay = new JTextField();
        JTextField tfMonth = new JTextField();
        JTextField tfYear = new JTextField();
        JTextField tfDateTime = new JTextField();
        
        // Date chooser
        JDateChooser dc = new JDateChooser();
        dc.setDateFormatString("yyyy-MM-dd");
        pnlLoan.add(dc);
        dc.setBounds(175, 170, 148, 20);

        // Buttons
        JButton btnCheckReaderId = new JButton("Kiểm tra");
        btnCheckReaderId.setBackground(new Color(235, 189, 157));
        JButton btnCheckBookId = new JButton("Kiểm tra");
        btnCheckBookId.setBackground(new Color(235, 189, 157));
        JButton btnLoanBook = new JButton("Mượn sách");
        btnLoanBook.setBackground(new Color(66, 178, 219));
        JButton btnReturnBook = new JButton("Trả sách");
        btnReturnBook.setBackground(new Color(66, 178, 219));
        JButton btnSearchLoan = new JButton("Tìm kiếm");
        btnSearchLoan.setBackground(new Color(66, 178, 219));
        JButton btnResetLoan = new JButton("Nhập lại");
        btnResetLoan.setBackground(new Color(66, 178, 219));
        JButton btnPunish = new JButton("DS Phạt");
        btnPunish.setBackground(new Color(66, 178, 219));
        JButton backButton = new JButton("Quay lại");
       
        //quaylai
//        backButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                new LibraryDashboard().setVisible(true);
//                dispose();  // Ẩn cửa sổ LibraryManagement hiện tại
//            }
//        });
        pnlLoan.add(backButton);
        // ComboBox
        JComboBox<String> cbbLoanNo = new JComboBox<>();
        JLabel imageLabel = new JLabel();
        try {
            ImageIcon imageIcon = new ImageIcon("src\\image\\quanlydocgia.jpg");
            imageLabel.setIcon(imageIcon);
        } catch (Exception e) {
            System.out.println("Không thể tải hình ảnh: " + e.getMessage());
        }
        imageLabel.setBounds(520, 50, 600, 200);
        pnlLoan.add(imageLabel);
        //vitri
        backButton.setBounds(10, 10, 100, 30);//quaylai
        lblReaderId.setBounds(65, 70, 100, 20);//madocgia
        lblBookId.setBounds(65, 120, 100, 20);//masach
        lblReturnAppointmentDate.setBounds(65, 170, 148, 20);//ngayhentra
        lblOutputReader.setBounds(175, 46, 221, 20);
        lblOutputBook.setBounds(175, 100, 221, 20);
        
        tfReaderId.setBounds(175,70, 138, 20);
        tfBookId.setBounds(175, 120, 138, 20);
        tfDateTime.setBounds(217, 120, 55, 28);
        
        btnCheckReaderId.setBounds(323, 70, 90, 21);
        btnCheckBookId.setBounds(323, 120, 90, 20);
        btnLoanBook.setBounds(10, 237, 100, 28);
        btnReturnBook.setBounds(150, 237, 100, 28);
        tfSearchLoan.setBounds(570, 237, 470, 28);//thanh tim kiem
        btnSearchLoan.setBounds(1051, 236, 100, 28);//nut tim kiem
        tfDay.setBounds(217, 150, 55, 28);
        tfMonth.setBounds(282, 150, 55, 28);
        tfYear.setBounds(347, 150, 49, 28);
        btnResetLoan.setBounds(290, 237, 100, 28);//nhap lai
        btnPunish.setBounds(430, 237, 100, 28);//phat
//        lblHeading.setBounds(780,0,300,50);
//        lblHeading.setFont(new Font("Dialog", Font.BOLD, 20));
        
        pnlLoan.add(lblReaderId);
        pnlLoan.add(lblBookId);
        pnlLoan.add(lblReturnAppointmentDate);
        pnlLoan.add(tfReaderId);
        pnlLoan.add(tfBookId);
        pnlLoan.add(btnCheckReaderId);
        pnlLoan.add(btnCheckBookId);
        pnlLoan.add(btnLoanBook);
        pnlLoan.add(btnReturnBook);
        pnlLoan.add(tfSearchLoan);
        pnlLoan.add(btnSearchLoan);
        pnlLoan.add(lblOutputReader);
        pnlLoan.add(lblOutputBook);
        pnlLoan.add(btnResetLoan);
        pnlLoan.add(btnPunish);
        pnlLoan.add(backButton);
//        pnlLoan.add(lblHeading);
        frame.add(tabbedPane);
        frame.setVisible(true);
       //test
//       
       
    }
}
