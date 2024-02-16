package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public abstract class Entity extends GameMaster {
    protected float posX;
    protected float posY;
    private float speed;
    
    public Entity(float posX, float posY, float speed) {
    	this.posX = posX;
    	this.posY = posY;
    	this.speed = speed;
    	
    }
    
    public float getPosX() {
        return posX;
    }

    public void setPosX(float posX) {
        this.posX = posX;
    }

   
    public float getPosY() {
        return posY;
    }

    public void setPosY(float posY) {
        this.posY = posY;
    }

 
    
    public float getSpeed() {
		return speed;
	}
   
    public void setSpeed(float speed) {
    	this.speed = speed;
    }
    

    
    public void draw(ShapeRenderer shape) {
    	
    }
    
    public void draw(SpriteBatch batch) {
    	
    }

    
   
    @Override
    public void movement() {

    	// Implement user-controlled movement logic for the bucket if needed
        if (Gdx.input.isKeyPressed(Keys.LEFT)) {
            posX -= 200 * Gdx.graphics.getDeltaTime();
        }

        if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
            posX += 200 * Gdx.graphics.getDeltaTime();
        }
    }
    
    public abstract void update();

	public abstract void draw(SpriteBatch batch, ShapeRenderer shape);

}
