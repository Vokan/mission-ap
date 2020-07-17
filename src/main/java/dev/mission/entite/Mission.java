/**
 * 
 */
package dev.mission.entite;

/**
 * @author vokankocak
 *
 */
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue; import javax.persistence.GenerationType; import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name = "MISSION") 
	public class Mission {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) 
		@Column(name="ID")
		private Integer id;
		
		@Column(name="LIBELLE")
		private String libelle;
		
		@Column(name="DATE_DEBUT")
		private LocalDate dateDebut; 
		
		@Column(name="DATZ_FIN")
		private LocalDate dateFin;
		
		@Column(name="TAUX_JOURNALIER")
		private BigDecimal tauxJournalier;

		
		
		/** Getter
		 * @return the id
		 */
		public Integer getId() {
			return id;
		}

		/** Setter
		 * @param id the id to set
		 */
		public void setId(Integer id) {
			this.id = id;
		}

		/** Getter
		 * @return the libelle
		 */
		public String getLibelle() {
			return libelle;
		}

		/** Setter
		 * @param libelle the libelle to set
		 */
		public void setLibelle(String libelle) {
			this.libelle = libelle;
		}

		/** Getter
		 * @return the dateDebut
		 */
		public LocalDate getDateDebut() {
			return dateDebut;
		}

		/** Setter
		 * @param dateDebut the dateDebut to set
		 */
		public void setDateDebut(LocalDate dateDebut) {
			this.dateDebut = dateDebut;
		}

		/** Getter
		 * @return the dateFin
		 */
		public LocalDate getDateFin() {
			return dateFin;
		}

		/** Setter
		 * @param dateFin the dateFin to set
		 */
		public void setDateFin(LocalDate dateFin) {
			this.dateFin = dateFin;
		}

		/** Getter
		 * @return the tauxJournalier
		 */
		public BigDecimal getTauxJournalier() {
			return tauxJournalier;
		}

		/** Setter
		 * @param tauxJournalier the tauxJournalier to set
		 */
		public void setTauxJournalier(BigDecimal tauxJournalier) {
			this.tauxJournalier = tauxJournalier;
		}

		
}

