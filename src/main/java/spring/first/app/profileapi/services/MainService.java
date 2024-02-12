package spring.first.app.profileapi.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import spring.first.app.profileapi.repositories.ProfileRepository;
import spring.first.app.profileapi.repositories.UserRepository;

@Service
@RequiredArgsConstructor
public class MainService {
    private final UserRepository userRepository;
    private final ProfileRepository profileRepository;
}
