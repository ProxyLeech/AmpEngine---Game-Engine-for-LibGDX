package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class TextureObject extends Entity implements iMovable {
	
//	private float posX;
//	private float posY;
//	private float speed;
	
	private Texture tex;
    private boolean aiControlled;


	public TextureObject(String fileName, float posX, float posY, int speed, boolean aiControlled)
	{
		super(posX, posY, speed);
		tex = new Texture(Gdx.files.internal(fileName));
		
		this.aiControlled = aiControlled;
	}

	
	public Texture getTexture()
	{
		return tex;
	}
	
	public void setTexture(Texture t) 
	{
		tex = t;
	}
	
	public void draw(SpriteBatch batch) {
		batch.draw(tex, getPosX(), getPosY(), tex.getWidth(), tex.getHeight());
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
//    public float getPosY() {
//        return posY;
//    }
//
//    public void setPosY(float posY) {
//        this.posY = posY;
//    }
//    
//    public float getDropSpeed() {
//		return speed;
//	}
//   
//    public void setDropSpeed(float f) {
//    	this.speed = f;
//    }
	
	
	
	   @Override
	    public void movement() {
	        if (aiControlled) {
	            // Implement AI-controlled movement logic for TextureObject
	            mouseAIControlled();
	        } else {
	            // Implement user-controlled movement logic for TextureObject
	            moveUserControlled();
	        }
	    }
		
	
	  // Implementing the abstract update method
	    @Override
	    public void update() {
	        if (aiControlled) {
//	            System.out.println("Droplets falling");
	            mouseAIControlled();
	        } else {
//	            System.out.println("Player-controlled update for TextureObject");
	            moveUserControlled();
	        }
	    }
    
  

    @Override
    public void mouseAIControlled() {
       
    }

    @Override
    public void moveUserControlled() {
    	
    	if (!aiControlled) {
    		
//    		System.out.println("I am a bucket  user");
    		 // Implement user-controlled movement logic for the bucket if needed
            if (Gdx.input.isKeyPressed(Keys.LEFT)) {
                posX -= 200 * Gdx.graphics.getDeltaTime();
            }

            if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
                posX += 200 * Gdx.graphics.getDeltaTime();
            }
            
            System.out.println("Bucket:" +" at position (" + posX + ", " + posY + ")");

    	}
    	else {
    		
    	}
		
    	
    }
    
    @Override
    public void draw(SpriteBatch batch, ShapeRenderer shape) {



    }
    
 
	

	
}



