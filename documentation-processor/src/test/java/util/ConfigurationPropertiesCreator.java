package util;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.koval.resolver.common.api.configuration.bean.processors.DocumentationProcessorConfiguration;

public final class ConfigurationPropertiesCreator {

  private ConfigurationPropertiesCreator() {

  }

  public static DocumentationProcessorConfiguration createProperties(
    final List<String> metadataStrings,
    final File file
  ) throws IOException {
    final File tempFile = writeStringsToFile(metadataStrings, file);

    DocumentationProcessorConfiguration properties = new DocumentationProcessorConfiguration();
    properties.setDocsListFile(tempFile.getPath());
    properties.setDocsFolder(tempFile.getParent());

    return properties;
  }

  static File writeStringsToFile(
    final List<String> metadataStrings,
    final File file
  ) throws IOException {
    for (String metadataString : metadataStrings) {
      FileUtils.writeStringToFile(file, metadataString, Charset.defaultCharset(), true);
    }

    return file;
  }
}
