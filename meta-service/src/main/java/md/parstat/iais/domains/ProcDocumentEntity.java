package md.parstat.iais.domains;

import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

import md.parstat.iais.domains.abstracts.AbstractDomainObject;
import md.parstat.iais.domains.interfaces.ProcDocument;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity(name = "ProcDocument")
@Table(name = "proc_document")
public class ProcDocumentEntity extends AbstractDomainObject implements ProcDocument {

	@Column(name = "doc_year")
	private Integer docYear;

	@Column(name = "file_extentions")
	private String fileExtentions;

	@Column(name = "file_name")
	private String fileName;

	@Column(name = "file_path")
	private String filePath;

	@Column(name = "link_en")
	private String linkEn;

	@Column(name = "link_ro")
	private String linkRo;

	@Column(name = "link_ru")
	private String linkRu;

	@Column(name = "title_en")
	private String titleEn;

	@Column(name = "title_ro")
	private String titleRo;

	@Column(name = "title_ru")
	private String titleRu;

	// bi-directional many-to-one association to StatPocDocument
	@OneToMany(mappedBy = "document")
	private List<StatPocDocumentEntity> statRpocDocuments;

}