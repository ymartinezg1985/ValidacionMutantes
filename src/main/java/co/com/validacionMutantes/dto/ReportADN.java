package co.com.validacionMutantes.dto;

/**
 * @author Ymartinezg
 *
 */

public class ReportADN {

	private Double ratio;

	private Integer count_mutant_dna;

	private Integer count_human_dna;

	public ReportADN(Double ratio, Integer count_mutant_dna, Integer count_human_dna) {
		super();
		this.ratio = ratio;
		this.count_mutant_dna = count_mutant_dna;
		this.count_human_dna = count_human_dna;
	}

	public ReportADN() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Double getRatio() {
		return ratio;
	}

	public void setRatio(Double ratio) {
		this.ratio = ratio;
	}

	public Integer getCount_mutant_dna() {
		return count_mutant_dna;
	}

	public void setCount_mutant_dna(Integer count_mutant_dna) {
		this.count_mutant_dna = count_mutant_dna;
	}

	public Integer getCount_human_dna() {
		return count_human_dna;
	}

	public void setCount_human_dna(Integer count_human_dna) {
		this.count_human_dna = count_human_dna;
	}

}
