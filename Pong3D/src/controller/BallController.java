package controller;

import model.elements.gameelements.Ball;
import view.gameelementsview.BallView;

/**
 * Controller Class for the Ball
 * 
 * @author Giosuè Filippini
 * @author Manuel Gallina
 */
public class BallController 
{

	private Ball ball;
	private BallView ballView;
	
	/**
	 * Default constructor
	 */
	public BallController()
	{
		this.ball = new Ball();
		this.ballView = new BallView();
		this.ballView.setParentPosition(ball.getPosition());
	}
	
	/**
	 * @return the ball
	 */
	public Ball getBall() {
		return ball;
	}
	
	/**
	 * @return the ball's view
	 */
	public BallView getBallView() {
		return ballView;
	}
	
	
}
