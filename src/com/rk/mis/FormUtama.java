package com.rk.mis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class FormUtama extends JFrame {

    JMenuBar PenampungMenu;
    JMenu IndukMenu;
    JMenuItem itemTambah;

    public FormUtama() {
        super("Icon dan Shortcut Pada Menu Item");
        Inisialisai_Komponen();
    }

    public void Inisialisai_Komponen() {
        PenampungMenu = new JMenuBar();
        IndukMenu = new JMenu("File");

        aturIconDanShortcutMenu();

        IndukMenu.add(itemTambah);
        PenampungMenu.add(IndukMenu);
        setJMenuBar(PenampungMenu);
        setPreferredSize(new Dimension(500, 300));
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void aturIconDanShortcutMenu() {
        itemTambah = new JMenuItem("Tambah Data");
        itemTambah.setIcon(new ImageIcon("images/tambah.png"));
        itemTambah.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_MASK));
        itemTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

}
