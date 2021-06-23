package org.mskcc.cmo.metadb.service;

import java.util.List;
import org.mskcc.cmo.metadb.model.SampleMetadata;

/**
 *
 * @author ochoaa
 */
public interface MetadbRestService {

    List<SampleMetadata> getSampleMetadataListByCmoPatientId(String cmoPatientId) throws Exception;

}