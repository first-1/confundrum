package com.corimi.confundrum;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.corimi.screens.GameScreen;

public class Confundrum extends Game {

	public static Screen gameScreen;

	public Confundrum() {
		super();
	}

	@Override
	public void create() {
		gameScreen = new GameScreen();
		setScreen(gameScreen);
	}
}
