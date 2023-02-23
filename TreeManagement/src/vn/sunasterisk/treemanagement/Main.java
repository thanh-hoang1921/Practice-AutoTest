package vn.sunasterisk.treemanagement;

import vn.sunasterisk.treemanagement.model.Flower;
import vn.sunasterisk.treemanagement.model.Tree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower flower1 = new Flower("Hoa Hồng", "Màu đỏ");
		Tree tree1 = new Tree ("Cây Hồng", 1.2, flower1);
		tree1.displayInformation();
		/*
		 * flower1.setColor("Màu Tím");
		 * 
		 * Flower flower2 = new Flower("Hoa Ly", "Màu trắng"); tree1.setFlower(flower2);
		 * tree1.displayInformation();
		 */
		
		tree1.changeName("Cây hoa Hông");
		tree1.changeHeight(1.3);
		tree1.displayInformation();
		
		
		Flower flower2 = new Flower("Hoa Ly", "Màu trắng");
		tree1.changeFlower(flower2);
		tree1.displayInformation();
	}

}
