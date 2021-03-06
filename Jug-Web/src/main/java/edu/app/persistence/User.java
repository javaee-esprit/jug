package edu.app.persistence;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;


// TODO: Auto-generated Javadoc
/**
 * Entity implementation class for Entity: User.
 */
@Entity
@Table(name = "t_user")
public class User implements Serializable {

	/** The id user. */
	private int idUser;

	/** The nom. */
	private String nom;

	/** The Prenom. */
	private String prenom;



	/** The mail. */
	private String mail;

	/** The etat. */
	private String etat;

	/** The login. */
	private String login;

	/** The password. */
	private String password;

	/** The sexe. */
	private String sexe;

	/** The date naiss. */
	private Date dateNaiss;

	/** The role. */
	private Role role;
	private Picture picture;






	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new user.
	 */
	public User() {
		super();
	}

	/**
	 * Gets the id user.
	 * 
	 * @return the id user
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getidUser() {
		return this.idUser;
	}

	/**
	 * Sets the id user.
	 * 
	 * @param idUser
	 *            the new id user
	 */
	public void setidUser(int idUser) {
		this.idUser = idUser;
	}

	/**
	 * Gets the nom.
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * Sets the nom.
	 * 
	 * @param nom
	 *            the new nom
	 */
	public void setNom(String nom) {
		String oldNom = this.nom;
		this.nom = nom;
		changeSupport.firePropertyChange("nom", oldNom, nom);

	}

	/**
	 * Gets the prenom.
	 * 
	 * @return the prenom
	 */



	/**
	 * Gets the mail.
	 * 
	 * @return the mail
	 */

	public String getMail() {
		return this.mail;
	}

	/**
	 * Sets the mail.
	 * 
	 * @param mail
	 *            the new mail
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * Gets the etat.
	 * 
	 * @return the etat
	 */
	public String getEtat() {
		return this.etat;
	}

	/**
	 * Sets the etat.
	 * 
	 * @param etat
	 *            the new etat
	 */
	public void setEtat(String etat) {
		this.etat = etat;
	}

	/**
	 * Gets the login.
	 * 
	 * @return the login
	 */
	public String getLogin() {
		return this.login;
	}

	/**
	 * Sets the login.
	 * 
	 * @param login
	 *            the new login
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * Gets the password.
	 * 
	 * @return the password
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * Sets the password.
	 * 
	 * @param password
	 *            the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets the sexe.
	 * 
	 * @return the sexe
	 */
	public String getSexe() {
		return this.sexe;
	}

	/**
	 * Sets the sexe.
	 * 
	 * @param sexe
	 *            the new sexe
	 */
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	/**
	 * Gets the date naiss.
	 * 
	 * @return the date naiss
	 */
	public Date getDateNaiss() {
		return this.dateNaiss;
	}

	/**
	 * Sets the date naiss.
	 * 
	 * @param dateNaiss
	 *            the new date naiss
	 */
	public void setDateNaiss(Date dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	/**
	 * Instantiates a new user.
	 * 
	 * @param nom
	 *            the nom
	 * @param prenom
	 *            the prenom
	 * @param cin
	 *            the cin
	 * @param mail
	 *            the mail
	 * @param etat
	 *            the etat
	 * @param login
	 *            the login
	 * @param password
	 *            the password
	 * @param sexe
	 *            the sexe
	 * @param dateNaiss
	 *            the date naiss
	 */
	public User(String nom, String prenom, String mail, String etat,
			String login, String password, String sexe, Date dateNaiss) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		
		this.mail = mail;
		this.etat = etat;
		this.login = login;
		this.password = password;
		this.sexe = sexe;
		this.dateNaiss = dateNaiss;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "User [nom=" + nom + ", Prenom=" + prenom 
				+ ", mail=" + mail + ", etat=" + etat + ", login=" + login
				+ ", password=" + password + ", sexe=" + sexe + ", date_naiss="
				+ dateNaiss + "]";
	}

	/**
	 * Gets the role.
	 * 
	 * @return the role
	 */
	@ManyToOne
	@JoinColumn(name = "role_fk")
	public Role getRole() {
		return role;
	}

	/**
	 * Sets the role.
	 * 
	 * @param role
	 *            the new role
	 */
	public void setRole(Role role) {
		this.role = role;
	}


	
	@Transient
	public PropertyChangeSupport getChangeSupport() {
		return changeSupport;
	}

	/**
	 * Sets the change support.
	 * 
	 * @param changeSupport
	 *            the new change support
	 */
	public void setChangeSupport(PropertyChangeSupport changeSupport) {
		this.changeSupport = changeSupport;
	}

	/** The change support. */
	private PropertyChangeSupport changeSupport = new PropertyChangeSupport(
			this);

	/**
	 * Adds the property change listener.
	 * 
	 * @param listener
	 *            the listener
	 */
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		changeSupport.addPropertyChangeListener(listener);
	}

	/**
	 * Removes the property change listener.
	 * 
	 * @param listener
	 *            the listener
	 */
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		changeSupport.removePropertyChangeListener(listener);
	}

	
	/**
	 * Gets the picture.
	 * 
	 * @return the picture
	 */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "picture_fk", unique = true)
	public Picture getPicture() {
		return picture;
	}

	/**
	 * Sets the picture.
	 * 
	 * @param picture
	 *            the new picture
	 */
	public void setPicture(Picture picture) {
		this.picture = picture;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	

	
	

	
	

}
