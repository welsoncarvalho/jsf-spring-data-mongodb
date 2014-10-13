package br.com.teste.jsdm.step;

import java.io.Serializable;

/**
 * DOCUMENT ME!.
 *
 * @author Welson
 * @param <I> tipo genérico
 * @param <O> tipo genérico
 */
public interface ItemProcessor<I, O> extends
		org.springframework.batch.item.ItemProcessor<I, O>, Serializable {

}
