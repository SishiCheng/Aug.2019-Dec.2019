package edu.psu.bd.cs.smc6823.vowelcount.controllers;

import edu.psu.bd.cs.smc6823.vowelcount.dtos.CountDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountController
{
    @GetMapping( path = "/count")
    public CountDTO countVowels( @RequestParam(name = "word") String word )
    {
        word = word.toLowerCase();
        CountDTO count = new CountDTO( 0, 0, 0, 0, 0);

        for (int i = 0; i < word.length(); i++)
        {
            char c = word.charAt( i );

            switch ( c )
            {
                case 'a':
                    count.setACount( count.getACount() + 1 );
                    break;

                case 'e':
                    count.setECount( count.getECount() + 1 );
                    break;

                case 'i':
                    count.setICount( count.getICount() + 1 );
                    break;

                case 'o':
                    count.setOCount( count.getOCount() + 1 );
                    break;

                case 'u':
                    count.setUCount( count.getUCount() + 1 );
                    break;
            }
        }

        return count;
    }
}
