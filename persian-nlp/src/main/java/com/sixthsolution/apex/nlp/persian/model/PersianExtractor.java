package com.sixthsolution.apex.nlp.persian.model;

import com.sixthsolution.apex.nlp.ner.ChunkedPart;
import com.sixthsolution.apex.nlp.persian.event.PersianEventBuilder;
import org.threeten.bp.LocalDateTime;

/**
 * @author Saeed Masoumi (s-masoumi@live.com)
 */

public interface PersianExtractor {
    void extract(PersianEventBuilder builder, LocalDateTime source, ChunkedPart chunkedPart);
}
