package br.com.teste.jsdm.step;

import java.io.Serializable;

/**
 * DOCUMENT ME!.
 *
 * @author Welson
 * @param <T> tipo genérico
 */
public interface ItemReader<T> extends
		org.springframework.batch.item.ItemReader<T>, Serializable {

}
