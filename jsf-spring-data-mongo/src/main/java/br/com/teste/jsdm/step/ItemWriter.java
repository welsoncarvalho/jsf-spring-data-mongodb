package br.com.teste.jsdm.step;

import java.io.Serializable;

/**
 * DOCUMENT ME!.
 *
 * @author Welson
 * @param <T> tipo genérico
 */
public interface ItemWriter<T> extends
		org.springframework.batch.item.ItemWriter<T>, Serializable {

}
