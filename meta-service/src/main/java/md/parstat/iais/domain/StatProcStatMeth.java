package md.parstat.iais.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="stat_proc_stat_meth")
@NamedQuery(name="StatProcStatMeth.findAll", query="SELECT s FROM StatProcStatMeth s")
public class StatProcStatMeth implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="end_date")
	private Date endDate;

	@Column(name="\"ORDER\"")
	private BigDecimal order;

	@Temporal(TemporalType.DATE)
	@Column(name="start_date")
	private Date startDate;

	//bi-directional many-to-one association to GsbpmStatProc
	@ManyToOne
	@JoinColumn(name="id_gsbpm_stat_proc")
	private GsbpmStatProc gsbpmStatProc;

	//bi-directional many-to-one association to StatMethod
	@ManyToOne
	@JoinColumn(name="id_methods")
	private StatMethod statMethod;



}