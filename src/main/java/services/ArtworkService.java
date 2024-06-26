package services;

import com.example.swd392.Request.ArtworkRequest.CreateArtworkRequest;
import com.example.swd392.Request.ArtworkRequest.UpdateArtworkRequest;
import com.example.swd392.Response.ArtworkResponse.CreateArtworkResponse;
import com.example.swd392.Response.ArtworkResponse.DeleteArtworkResponse;
import com.example.swd392.Response.ObjectResponse.ResponseObject;
import com.example.swd392.Response.UserResponse.ArtworkOrderDetailDTO;
import com.example.swd392.model.Artwork;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ArtworkService {
    public List<Artwork> getListArtworkForGuest(int count);
    public CreateArtworkResponse createArtwork(CreateArtworkRequest request);
    DeleteArtworkResponse deleteArtwork(int artworkId);
    public CreateArtworkResponse updateArtwork(int artworkId,UpdateArtworkRequest request);
    ResponseEntity<ResponseObject> findArtworkId(Integer artworkId);

    List<Artwork> getAllArtworks();

    List<Artwork> findArtworksByFilter(String artworkName,  double price);
    public byte[] downloadImage(int fileName);
    List<Artwork> getArtWorkByCreatorId(int id);

    public List<ArtworkOrderDetailDTO> getOrderDetailsByArtworkID(int artworkID);
}
