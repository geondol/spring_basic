package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(

        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
        //configuration 어노테이션 달려있는거는 전부다 빼겟다
)
public class AutoAppConfig {

//    @Bean
//    MemberRepository memberRepository(){
//        return new MemoryMemberRepository();
//    }

}
