package values;

/**
 * Classe abstraite qui va servir pour l'analyse de texte. Elle contiendra par exemple le mot à rechercher. 
 * @author Groupe de Zététique
 *
 * @param <V> Une valeur sans type défini. Elle pourra être par exemple un entier où une chaîne de caractère
 */
public abstract class Value<V> {

	protected V value;
	
	/**
	 * Crée une Value et met la valeur à null
	 */
	public Value () {
		this.value = null;
	}
	
	/**
	 * Crée une Value avec la valeur en paramètre
	 * @param value la valeur à attribuer
	 */
	public Value (V value) {
		this.value = value;
	}
	
}
