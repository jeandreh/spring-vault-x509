package com.baeldung.spring.security.x509;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.vault.annotation.VaultPropertySource;
import org.springframework.vault.config.EnvironmentVaultConfiguration;

@Configuration
@Import(EnvironmentVaultConfiguration.class)
@VaultPropertySource(
        value = "aws/creds/backoffice",
        propertyNamePrefix = "aws.",
        renewal = VaultPropertySource.Renewal.ROTATE
)
public class VaultConfiguration {
}
