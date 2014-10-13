package br.com.teste.jsdm.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// TODO: Auto-generated Javadoc
/**
 * DOCUMENT ME!.
 *
 * @author Welson
 */
@Document(collection = "step")
public class Step extends EntidadeBase {

	/** A constante serialVersionUID. */
	private static final long serialVersionUID = 169305525336901974L;

	/** id. */
	@Id
	private String id;
	
	/** name. */
	private String name;
	
	/** reader. */
	private String reader;
	
	/** process. */
	private String process;
	
	/** writer. */
	private String writer;
	
	/** process id. */
	private String processId;
	
	/**
	 * Obtém id.
	 *
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Define id.
	 *
	 * @param id novo id
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * Obtém name.
	 *
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Define name.
	 *
	 * @param name novo name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Obtém reader.
	 *
	 * @return reader
	 */
	public String getReader() {
		return reader;
	}

	/**
	 * Define reader.
	 *
	 * @param reader novo reader
	 */
	public void setReader(String reader) {
		this.reader = reader;
	}

	/**
	 * Obtém process.
	 *
	 * @return process
	 */
	public String getProcess() {
		return process;
	}

	/**
	 * Define process.
	 *
	 * @param process novo process
	 */
	public void setProcess(String process) {
		this.process = process;
	}

	/**
	 * Obtém writer.
	 *
	 * @return writer
	 */
	public String getWriter() {
		return writer;
	}

	/**
	 * Define writer.
	 *
	 * @param writer novo writer
	 */
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	/**
	 * Obtém process id.
	 *
	 * @return process id
	 */
	public String getProcessId() {
		return processId;
	}
	
	/**
	 * Define process id.
	 *
	 * @param processId novo process id
	 */
	public void setProcessId(String processId) {
		this.processId = processId;
	}

	/* (non-Javadoc)
	 * @see br.com.teste.jsdm.model.EntidadeBase#getID()
	 */
	@Override
	public Object getID() {
		return getId();
	}

}
