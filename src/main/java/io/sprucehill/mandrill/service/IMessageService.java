/*
Copyright 2013-2014 SpruceHill.io GmbH

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package io.sprucehill.mandrill.service;

import io.sprucehill.mandrill.data.error.MessageError;
import io.sprucehill.mandrill.data.error.PreBuildError;
import io.sprucehill.mandrill.data.error.TemplateMessageError;
import io.sprucehill.mandrill.data.request.MessagePayload;
import io.sprucehill.mandrill.data.request.TemplateMessagePayload;
import io.sprucehill.mandrill.data.response.MessageResponse;

import java.io.IOException;
import java.util.List;

/**
 * @author Michael Duergner <michael@sprucehill.io>
 */
public interface IMessageService {

    /**
     *
     * @param payload
     * @return
     * @throws MessageError
     * @throws IOException
     */
    List<MessageResponse> sendMessage(MessagePayload payload) throws MessageError, IOException;

    /**
     *
     * @param payloadBuilder
     * @return
     * @throws PreBuildError
     * @throws MessageError
     * @throws IOException
     */
    List<MessageResponse> sendMessage(MessagePayload.Builder payloadBuilder) throws PreBuildError, MessageError, IOException;

    /**
     *
     * @param payload
     * @return
     * @throws TemplateMessageError
     * @throws IOException
     */
    List<MessageResponse> sendTemplateMessage(TemplateMessagePayload payload) throws TemplateMessageError, IOException;

    /**
     *
     * @param payloadBuilder
     * @return
     * @throws PreBuildError
     * @throws TemplateMessageError
     * @throws IOException
     */
    List<MessageResponse> sendTemplateMessage(TemplateMessagePayload.Builder payloadBuilder) throws PreBuildError, TemplateMessageError, IOException;
}