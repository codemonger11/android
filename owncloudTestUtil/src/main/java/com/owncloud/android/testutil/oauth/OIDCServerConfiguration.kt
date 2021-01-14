/**
 * ownCloud Android client application
 *
 * @author Abel García de Prada
 * Copyright (C) 2021 ownCloud GmbH.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.owncloud.android.testutil.oauth

import com.owncloud.android.domain.authentication.oauth.model.OIDCServerConfiguration

val OC_OIDC_SERVER_CONFIGURATION = OIDCServerConfiguration(
    authorization_endpoint = "https://ocis.owncloud.works/signin/v1/identifier/_/authorize",
    check_session_iframe = "https://ocis.owncloud.works/konnect/v1/session/check-session.html",
    end_session_endpoint = "https://ocis.owncloud.works/signin/v1/identifier/_/endsession",
    issuer = "https://ocis.owncloud.works/",
    registration_endpoint = "https://ocis.owncloud.works/konnect/v1/register",
    response_types_supported = listOf(
        "id_token token",
        "id_token",
        "code id_token",
        "code id_token token"
    ),
    scopes_supported = listOf(
        "openid",
        "offline_access",
        "konnect/raw_sub",
        "profile",
        "email",
        "konnect/uuid"
    ),
    token_endpoint = "https://ocis.owncloud.works/konnect/v1/token",
    token_endpoint_auth_methods_supported = listOf(),
    userinfo_endpoint = "https://ocis.owncloud.works/konnect/v1/userinfo"
)
