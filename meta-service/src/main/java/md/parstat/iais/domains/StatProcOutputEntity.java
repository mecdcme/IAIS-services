package md.parstat.iais.domains;

import java.sql.Date;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

import md.parstat.iais.domains.abstracts.AbstractDomainObject;
import md.parstat.iais.domains.interfaces.StatProcOutput;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity(name = "StatProcOutput")
@Table(name = "stat_proc_output")
public class StatProcOutputEntity extends AbstractDomainObject implements StatProcOutput {

	@Column(name = "end_date")
	private Date endDate;

	@Column(name = "order_code")
	private Short orderCode;

	@Column(name = "start_date")
	private Date startDate;

	// bi-directional many-to-one association to GsbpmStatProc
	@ManyToOne
	@JoinColumn(name = "id_gsbpm_stat_proc")
	private GsbpmStatProcEntity gsbpmStatProc;

	// bi-directional many-to-one association to ProcOutput
	@ManyToOne
	@JoinColumn(name = "id_output")
	private ProcOutputEntity output;

}