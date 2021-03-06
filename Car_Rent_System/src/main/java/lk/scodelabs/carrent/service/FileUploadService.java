package lk.scodelabs.carrent.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileUploadService {
    void uploadNicFile(MultipartFile file, String id) throws IOException;

    void uploadOrderFile(MultipartFile file, String id) throws IOException;

    void uploadCarFiles(MultipartFile[] file, String id) throws IOException;
}
