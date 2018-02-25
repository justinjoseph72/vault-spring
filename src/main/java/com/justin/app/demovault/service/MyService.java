package com.justin.app.demovault.service;

import com.justin.app.demovault.domain.Secret;
import lombok.extern.slf4j.Slf4j;
import org.springframework.vault.authentication.TokenAuthentication;
import org.springframework.vault.client.VaultEndpoint;
import org.springframework.vault.core.VaultTemplate;
import org.springframework.vault.support.VaultResponseSupport;

@Slf4j
public class MyService {

   /* public void saveSomethig(){
        VaultTemplate vaultTemplate = new VaultTemplate(new VaultEndpoint(),
                new TokenAuthentication("00000000-0000-0000-0000-000000000000"));
        Secret secret =new Secret();
        secret.setUsername("justin");
        secret.setUsername("joseph");
        vaultTemplate.write("secret/myapp", secret);
        VaultResponseSupport<Secret> response = vaultTemplate.read("secret/myapp",Secret.class);
        log.info("the username is {} and password is {}",secret.getUsername(),secret.getPassword());
        vaultTemplate.delete("secret/myapp");
    }*/
}
