package br.com.lfa.ex5;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;

public class Main extends JFrame {
	public Main() {
		DefaultMutableTreeNode top, a1, id3,exp3, lp1,rp1, id4, st1, id2, exp4, id1, exp1, exp2, id, equals, exp,lp,rp,st,pl,a,b,c;
		c = new DefaultMutableTreeNode("C");
		b = new DefaultMutableTreeNode("B");
		lp = new DefaultMutableTreeNode("(");
		lp1 = new DefaultMutableTreeNode("(");
		rp = new DefaultMutableTreeNode(")");
		rp1 = new DefaultMutableTreeNode(")");
		pl = new DefaultMutableTreeNode("+");
		a = new DefaultMutableTreeNode("A");
		a1 = new DefaultMutableTreeNode("A");
		st = new DefaultMutableTreeNode("*");
		st1 = new DefaultMutableTreeNode("*");
		equals = new DefaultMutableTreeNode(":=");
		id = new DefaultMutableTreeNode("id");
		id.add(a1);
		id1 = new DefaultMutableTreeNode("id");
		id1.add(b);
		id3 = new DefaultMutableTreeNode("id");
		id3.add(a);
		id4 = new DefaultMutableTreeNode("id");
		id4.add(c);
		exp4 = new DefaultMutableTreeNode("exp");
		exp4.add(id4);
		exp3 = new DefaultMutableTreeNode("exp");
		exp3.add(lp1);
		exp3.add(exp4);
		exp3.add(rp1);
		exp2 = new DefaultMutableTreeNode("exp");
		exp2.add(id1);
		exp2.add(pl);
		exp2.add(exp3);
		exp1 = new DefaultMutableTreeNode("exp");
		exp1.add(lp);
		exp1.add(exp2);
		exp1.add(rp);
		exp = new DefaultMutableTreeNode("exp");
		exp.add(id3);
		exp.add(st);
		exp.add(exp1);
		top = new DefaultMutableTreeNode("atr");
		top.add(id);
		top.add(equals);
		top.add(exp);
		JTree tree = new JTree(top);
		add(tree);
		this.setPreferredSize(getMaximumSize());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JTree Example");       
        this.pack();
        this.setVisible(true);
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Main();
			}
		});
	}
}