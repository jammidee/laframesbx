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
 * File Create Date: 04/12/2024 12:28pm
 * Created by: Jammi Dee
 * Modified by: Jammi Dee
 *
*/

package com.lalulla.lakubosbx.routes.user;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @RequestMapping(method = RequestMethod.GET)
    public String getUser() {
        return "User information";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUser() {
        return "User added";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    public String editUser() {
        return "User edited";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public String deleteUser() {
        return "User deleted";
    }

}