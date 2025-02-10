package PackageRR;

/**
 *
 * @author KONE SAYBOU
 *
 */
public class Robot {

	private String couleur;
	private Position position;

	public Robot(String couleur, boolean actif) {
		super();
		this.couleur = couleur;
	}

	public Robot(String couleur, Position position) {
		super();
		this.couleur = couleur;
		this.position = position;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

}
