package co.com.validacionMutantes.entitie;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import co.com.validacionMutantes.dto.ReportADN;

/**
 * @author Ymartinezg
 *
 */
@SqlResultSetMapping(
        name = "resultReport",
        classes = @ConstructorResult(
                targetClass = ReportADN.class,
                columns = {
                    @ColumnResult(name = "ratio", type = Double.class),
                    @ColumnResult(name = "count_mutant_dna", type = Integer.class),
                    @ColumnResult(name = "count_human_dna", type = Integer.class)
                    }))

@NamedNativeQuery(name = "reportADN", resultSetMapping = "resultReport", query = "SELECT (SUM(Typeadn) / COUNT(*) * 100) AS ratio,"
		+ " ( SELECT COUNT(Typeadn) AS count_mutant_dna FROM cadenasmutantes WHERE Typeadn = 1 ) AS count_mutant_dna,"
		+ " ( SELECT COUNT(Typeadn) AS count_mutant_dna FROM cadenasmutantes WHERE Typeadn = 0 ) AS count_human_dna "
		+ " FROM cadenasmutantes as mutantes")

@Entity
@Table(name = "cadenasmutantes")
public class CadenasMutantes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id")
	private int id;

	@Column(name = "adn")
	private String adn;

	@Column(name = "Typeadn")
	private int typeadn;

	public CadenasMutantes() {
	}

	public CadenasMutantes(String adn) {
		this.adn = adn;
	}

	public CadenasMutantes(String adn, int id, int typeadn) {
		this.adn = adn;
		this.id = id;
		this.typeadn = typeadn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdn() {
		return adn;
	}

	public void setAdn(String adn) {
		this.adn = adn;
	}

	public int getTypeadn() {
		return typeadn;
	}

	public void setTypeadn(int typeadn) {
		this.typeadn = typeadn;
	}

}
