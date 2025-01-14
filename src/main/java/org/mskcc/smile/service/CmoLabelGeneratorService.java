package org.mskcc.smile.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.List;
import org.mskcc.smile.model.SampleMetadata;
import org.mskcc.smile.model.Status;
import org.mskcc.smile.model.igo.IgoSampleManifest;

/**
 *
 * @author ochoaa
 */
public interface CmoLabelGeneratorService {
    String generateCmoSampleLabel(String requestId,
            IgoSampleManifest sampleManifest, List<SampleMetadata> existingPatientSamples,
            List<SampleMetadata> samplesByAltId);
    String generateCmoSampleLabel(SampleMetadata sample, List<SampleMetadata> existingPatientSamples,
            List<SampleMetadata> samplesByAltId);
    Status generateSampleStatus(String requestId, IgoSampleManifest sampleManifest,
            List<SampleMetadata> existingSamples) throws JsonProcessingException;
    Status generateSampleStatus(SampleMetadata sampleMetadata,
            List<SampleMetadata> existingSamples) throws JsonProcessingException;
    Boolean igoSampleRequiresLabelUpdate(String newCmoLabel, String existingCmoLabel);
    String resolveSampleTypeAbbreviation(String specimenTypeValue, String sampleOriginValue,
            String cmoSampleClassValue);
    String generateValidationReport(String originalJson, String filteredJson, Boolean isSample)
            throws JsonProcessingException;
    String incrementNucleicAcidCounter(String cmoLabel);
}
