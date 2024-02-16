package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Circle extends Entity implements iMovable {
//	
//	private float posX;
//	private float posY;
//	private float speed;
	private Color color;
	private float radius;
	

	public Circle(float posX, float posY, int speed, Color color, float radius)
	{
		super(posX, posY, speed);
//		this.posX = posX;
//		this.posY = posY;
//		this.speed = speed;
		this.color = color;
		this.radius = radius;
		
	}
//	
//	public float getPosX() {
//        return posX;
//    }
//
//    public void setPosX(float posX) {
//        this.posX = posX;
//    }
//    
//    
//	public float getPosY() {
//        return posY;
//    }
//
//    public void setPosY(float posY) {
//        this.posY = posY;
//    }
//    
//    public float getCircleSpeed() {
//		return speed;
//	}
//   
//    public void setCircleSpeed(int circleSpeed) {
//    	this.speed = circleSpeed;
//    }
//    
    public Color getCircleColor() {
		return color;
	}
   
    public void setCircleColor(Color color) {
    	this.color = color;
    }
    

    public float getRadius() {
    	return radius;
    }
    
    public void setRadius(float radius) {
    	this.radius = radius;
    }
    
    
	public void draw(ShapeRenderer shape) {
		shape.setColor(getCircleColor());
		shape.circle(getPosX(), getPosY(), getRadius());
		
	}
	
	 // Movement method for Circle
    @Override
    public void movement() {
//        if (Gdx.input.isKeyPressed(Keys.W)) {
//        	setPosY(getPosY() + getSpeed() * Gdx.graphics.getDeltaTime());
//        }
//        if (Gdx.input.isKeyPressed(Keys.S)) {
//        	setPosY(getPosY() - getSpeed() * Gdx.graphics.getDeltaTime());
//        }
    }
    
  
    @Override
    public void mouseAIControlled() {
        // Implement mouse AI-controlled movement logic for Circle
    	
    }

    @Override
    public void moveUserControlled() {
        // Implement user-controlled movement logic for Circle
//    	System.out.println("I am a circle user");
    	
    	   if (Gdx.input.isKeyPressed(Keys.W)) {
           	setPosY(getPosY() + getSpeed() * Gdx.graphics.getDeltaTime());
           }
           if (Gdx.input.isKeyPressed(Keys.S)) {
           	setPosY(getPosY() - getSpeed() * Gdx.graphics.getDeltaTime());
           }
    }
	
    // Implementing the abstract update method
    @Override
    public void update() {
        System.out.println("In circle of radius " + getRadius() + " at position (" + getPosX() + ", " + getPosY() + ")");
    }

    @Override
    public void draw(SpriteBatch batch, ShapeRenderer shape) {
 
    }

    
	
}
