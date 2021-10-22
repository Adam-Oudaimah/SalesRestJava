/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.0.3).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package colourmyplate.data.rest.server.v1.api;

import colourmyplate.data.rest.server.v1.model.SaleDAO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-10-22T22:03:56.505222+03:00[Asia/Damascus]")

@Validated
@Api(value = "sales", description = "the sales API")
public interface SalesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "Store the new sale operation.", nickname = "createSaleOperation", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The new sale operation successfully stored."),
        @ApiResponse(code = 403, message = "Storing the new sale operation could not be completed."),
        @ApiResponse(code = 404, message = "Storing the new sale operation could not be completed because some meta data (product or seller or client could not be found)."),
        @ApiResponse(code = 500, message = "Internal server error.") })
    @RequestMapping(value = "/sales/create",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> createSaleOperation(@ApiParam(value = "The new sale operation metadata." ,required=true )  @Valid @RequestBody SaleDAO saleDAO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Get the available sales operations.", nickname = "getSalesOperations", notes = "", response = SaleDAO.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Sales operations successfully fetched.", response = SaleDAO.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "No sales operations available."),
        @ApiResponse(code = 500, message = "Internal server error.") })
    @RequestMapping(value = "/sales",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<SaleDAO>> getSalesOperations() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"seller\" : \"seller\",  \"total\" : 1.4658129,  \"client\" : \"client\",  \"id\" : \"id\",  \"creation_date\" : \"2000-01-23\",  \"order\" : [ {    \"sale_id\" : \"sale_id\",    \"quantity\" : 6,    \"product_id\" : \"product_id\",    \"id\" : \"id\",    \"product_price\" : 0.8008282  }, {    \"sale_id\" : \"sale_id\",    \"quantity\" : 6,    \"product_id\" : \"product_id\",    \"id\" : \"id\",    \"product_price\" : 0.8008282  } ]}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Update an exsiting sale operation metadata.", nickname = "updateSaleOperation", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The sale operation metadata successfully updated."),
        @ApiResponse(code = 403, message = "Updating the sale operation metadata could not be completed."),
        @ApiResponse(code = 500, message = "Internal server error.") })
    @RequestMapping(value = "/sales/update",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> updateSaleOperation(@ApiParam(value = "The updated sale operation metadata." ,required=true )  @Valid @RequestBody SaleDAO saleDAO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}