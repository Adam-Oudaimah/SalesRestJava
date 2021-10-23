/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.0.3).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package colourmyplate.data.rest.server.v1.api;

import colourmyplate.data.rest.server.v1.model.ClientDAO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-10-23T12:19:40.042692600+03:00[Asia/Damascus]")

@Validated
@Api(value = "clients", description = "the clients API")
public interface ClientsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "Store the new client.", nickname = "createClient", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The new client successfully stored."),
        @ApiResponse(code = 500, message = "Internal server error.") })
    @RequestMapping(value = "/clients/create",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> createClient(@ApiParam(value = "The new client metadata." ,required=true )  @Valid @RequestBody ClientDAO clientDAO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Get the available clients.", nickname = "getClients", notes = "", response = ClientDAO.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Clients successfully fetched.", response = ClientDAO.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "No clients available."),
        @ApiResponse(code = 500, message = "Internal server error.") })
    @RequestMapping(value = "/clients",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<ClientDAO>> getClients() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"name\" : \"name\",  \"mobile\" : \"mobile\",  \"last_name\" : \"last_name\",  \"id\" : \"id\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Update an exsiting client metadata.", nickname = "updateClient", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The client metadata successfully updated."),
        @ApiResponse(code = 404, message = "Updating the client could not be completed because it could not be found."),
        @ApiResponse(code = 500, message = "Internal server error.") })
    @RequestMapping(value = "/clients/{clientId}/update",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> updateClient(@ApiParam(value = "Numeric ID of the client to get",required=true) @PathVariable("clientId") Integer clientId,@ApiParam(value = "The updated client metadata." ,required=true )  @Valid @RequestBody ClientDAO clientDAO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
