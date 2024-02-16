package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Triangle extends Entity implements iMovable {
	
	
//	private float speed;
	private Color color;
	
//    private float posX;
//    private float posY;
//    
    private float width;
    private float height;
	

	
	public Triangle(float posX, float posY, int speed, Color color, float width, float height)
	{
		super(posX, posY, speed);
//		this.posX = posX;
//        this.posY = posY;
//
//        
//		this.speed = speed;
		this.color = color;
		
		this.width = width;
		this.height = height;
		
	}
	
	 
//    public float getPosX() {
//        return posX;
//    }
//
//    public void setPosX(float posX) {
//        this.posX = posX;
//    }
//
//   
//    public float getPosY() {
//        return posY;
//    }
//
//    public void setPosY(float posY) {
//        this.posY = posY;
//    }

// 
//    
//    public float getTriangleSpeed() {
//		return speed;
//	}
//   
//    public void setTriangleSpeed(int speed) {
//    	this.speed = speed;
//    }
    
    public Color getTriangleColor() {
		return color;
	}
   
    public void setTriangleColor(Color color) {
    	this.color = color;
    }
    
    
    
    
    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    
    
	public void draw(ShapeRenderer shape) {
		shape.setColor(getTriangleColor());
		shape.triangle(getPosX()- width / 2, getPosY() - height /2,
				getPosX() + width / 2, getPosY() - height / 2,
				getPosX(), getPosY() + height / 2);
		
	}
	

    @Override
    public void movement() {
//        if (Gdx.input.isKeyPressed(Keys.A)) {
//            setPosX(getPosX() - getSpeed() * Gdx.graphics.getDeltaTime());
//        }
//        if (Gdx.input.isKeyPressed(Keys.D)) {
//        	setPosX(getPosX() + getSpeed() * Gdx.graphics.getDeltaTime());
//        }
    }
    
  
    @Override
    public void mouseAIControlled() {
        // Implement mouse AI-controlled movement logic for Circle
    }

    @Override
    public void moveUserControlled() {
        // Implement user-controlled movement logic for Circle
    	
//    	System.out.println("I am a triangle  user");
    	
    	  if (Gdx.input.isKeyPressed(Keys.A)) {
              setPosX(getPosX() - getSpeed() * Gdx.graphics.getDeltaTime());
          }
          if (Gdx.input.isKeyPressed(Keys.D)) {
          	setPosX(getPosX() + getSpeed() * Gdx.graphics.getDeltaTime());
          }
    }
	
    // Implementing the abstract update method
    @Override
    public void update() {
        System.out.println("In triangle of width " + getWidth() + " and height " + getHeight() + " at position (" + getPosX() + ", " + getPosY() + ")");
    }
    
    @Override
    public void draw(SpriteBatch batch, ShapeRenderer shape) {
        // Draw logic for texture-based objects using SpriteBatch
    
    }

}
