/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Anton
 */
public class Stick {

	private int width = 20;
	private int height = 50;
	private Color color;
	private boolean isVertical;
	private Point p;

	public Stick(Color color, boolean isVertical, Point p) {
		this.color = color;
		this.isVertical = isVertical;
		this.p = p;
	}

	public void draw(Graphics g) {
		g.setColor(color);
		
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public boolean isIsVertical() {
		return isVertical;
	}

	public void setIsVertical(boolean isVertical) {
		this.isVertical = isVertical;
	}

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}
}
