/**
* OpenAPI Petstore
* This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models

import org.openapitools.client.models.Category
import org.openapitools.client.models.Tag

import kotlinx.serialization.Serializable as KSerializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual
import java.io.Serializable

/**
 * A pet for sale in the pet store
 * @param name 
 * @param photoUrls 
 * @param id 
 * @param category 
 * @param tags 
 * @param status pet status in the store
 */
@KSerializable
data class Pet (
    @SerialName(value = "name")
    val name: kotlin.String,
    @SerialName(value = "photoUrls")
    val photoUrls: kotlin.collections.List<kotlin.String>,
    @SerialName(value = "id")
    val id: kotlin.Long,
    @SerialName(value = "category")
    val category: Category,
    @SerialName(value = "tags")
    val tags: kotlin.collections.List<Tag>,
    /* pet status in the store */
    @SerialName(value = "status")
    val status: Pet.Status
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

    /**
     * pet status in the store
     * Values: AVAILABLE,PENDING,SOLD
     */
    @KSerializable
    enum class Status(val value: kotlin.String) {
        @SerialName(value = "available") AVAILABLE("available"),
        @SerialName(value = "pending") PENDING("pending"),
        @SerialName(value = "sold") SOLD("sold");
    }
}

