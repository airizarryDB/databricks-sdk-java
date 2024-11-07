// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * A credential represents an authentication and authorization mechanism for accessing services on
 * your cloud tenant. Each credential is subject to Unity Catalog access-control policies that
 * control which users and groups can access the credential.
 *
 * <p>To create credentials, you must be a Databricks account admin or have the `CREATE SERVICE
 * CREDENTIAL privilege. The user who creates the credential can delegate ownership to another user
 * or group to manage permissions on it
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface CredentialsService {
  /**
   * Create a credential.
   *
   * <p>Creates a new credential.
   */
  CredentialInfo createCredential(CreateCredentialRequest createCredentialRequest);

  /**
   * Delete a credential.
   *
   * <p>Deletes a credential from the metastore. The caller must be an owner of the credential.
   */
  void deleteCredential(DeleteCredentialRequest deleteCredentialRequest);

  /**
   * Generate a temporary service credential.
   *
   * <p>Returns a set of temporary credentials generated using the specified service credential. The
   * caller must be a metastore admin or have the metastore privilege **ACCESS** on the service
   * credential.
   */
  TemporaryCredentials generateTemporaryServiceCredential(
      GenerateTemporaryServiceCredentialRequest generateTemporaryServiceCredentialRequest);

  /**
   * Get a credential.
   *
   * <p>Gets a credential from the metastore. The caller must be a metastore admin, the owner of the
   * credential, or have any permission on the credential.
   */
  CredentialInfo getCredential(GetCredentialRequest getCredentialRequest);

  /**
   * List credentials.
   *
   * <p>Gets an array of credentials (as __CredentialInfo__ objects).
   *
   * <p>The array is limited to only the credentials that the caller has permission to access. If
   * the caller is a metastore admin, retrieval of credentials is unrestricted. There is no
   * guarantee of a specific ordering of the elements in the array.
   */
  ListCredentialsResponse listCredentials(ListCredentialsRequest listCredentialsRequest);

  /**
   * Update a credential.
   *
   * <p>Updates a credential on the metastore.
   *
   * <p>The caller must be the owner of the credential or a metastore admin or have the `MANAGE`
   * permission. If the caller is a metastore admin, only the __owner__ field can be changed.
   */
  CredentialInfo updateCredential(UpdateCredentialRequest updateCredentialRequest);

  /**
   * Validate a credential.
   *
   * <p>Validates a credential.
   *
   * <p>Either the __credential_name__ or the cloud-specific credential must be provided.
   *
   * <p>The caller must be a metastore admin or the credential owner.
   */
  ValidateCredentialResponse validateCredential(
      ValidateCredentialRequest validateCredentialRequest);
}
