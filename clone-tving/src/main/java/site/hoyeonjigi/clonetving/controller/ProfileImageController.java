package site.hoyeonjigi.clonetving.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.hoyeonjigi.clonetving.dto.ProfileImageDto;
import site.hoyeonjigi.clonetving.repository.ProfileRepository;
import site.hoyeonjigi.clonetving.service.ProfileImageService;
import site.hoyeonjigi.clonetving.service.ProfileService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@RestController
@RequestMapping("/profileimages")
@RequiredArgsConstructor
public class ProfileImageController {

    private final ProfileRepository profileRepository;
    private final ProfileImageService profileImageService;

    @GetMapping
    public List<ProfileImageDto> getProfileImageList() {
        return profileImageService.findProfileImageList();
    }
    
}
