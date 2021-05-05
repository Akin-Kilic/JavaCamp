package Concrete;

import Absract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		
		System.out.println(game.getName() + " eklendi !");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " güncellendi !");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " silindi !");
		
	}
}
