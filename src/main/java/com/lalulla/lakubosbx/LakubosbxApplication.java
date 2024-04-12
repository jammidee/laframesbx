/**
 * Copyright (C) 2023 Lalulla, Inc. All rights reserved.
 * Copyright (c) 2024 - Joel M. Damaso - mailto:jammi_dee@yahoo.com Manila/Philippines
 * This file is part of Lalulla System.
 * 
 * LaKuboSbx Framework is distributed under the terms of the GNU General Public License 
 * as published by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * LaKuboSbx System is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A 
 * PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Lalulla System.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Framework Designed by: Jammi Dee (jammi_dee@yahoo.com)
 *
 * File Create Date: 04/11/2024 07:28pm
 * Created by: Jammi Dee
 * Modified by: Jammi Dee
 *
*/

package com.lalulla.lakubosbx;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LakubosbxApplication {

    // ANSI escape codes for colors
    private static final String ANSI_COLOR_RESET 	= "\u001B[0m";
    //private static final String ANSI_COLOR_RED 		= "\u001B[31m";
    private static final String ANSI_COLOR_GREEN 	= "\u001B[32m";
    private static final String ANSI_COLOR_YELLOW 	= "\u001B[33m";

	public static void main(String[] args) {
		SpringApplication.run(LakubosbxApplication.class, args);
	}

	//Added by Jammi Dee 04/11/2024
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.printf("\n\n%sLet's inspect the beans provided by Spring Boot:%s\n\n", ANSI_COLOR_GREEN, ANSI_COLOR_RESET);

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				//System.out.println(beanName);
				System.out.printf(" Bean: %s%s%s\n", ANSI_COLOR_YELLOW, beanName, ANSI_COLOR_RESET );
			}

		};
	};	

}
