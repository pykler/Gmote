/**
 * Copyright 2009 Marc Stogaitis and Mimi Sun
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gmote.common.packet;

import java.io.Serializable;

import org.gmote.common.FileInfo;
import org.gmote.common.Protocol.Command;


/**
 * A request to run a file in its default application.
 * 
 * @author Marc
 * 
 */
public class RunFileReqPacket extends AbstractPacket implements Serializable{

  private static final long serialVersionUID = 1L;

  String pathAndFileName;

  FileInfo fileInfo;
  /**
   * Constructor.
   * @param pathAndFileName The full path and filename of the file to run.  
   */
  public RunFileReqPacket(String pathAndFileName) {
    super(Command.RUN);
    this.pathAndFileName = pathAndFileName;
  }
  
  public RunFileReqPacket(FileInfo file) {
    super(Command.RUN);
    this.fileInfo = file;
    this.pathAndFileName = file.getAbsolutePath();
  }

  public String getPathAndFileName() {
    return pathAndFileName;
  }

  public FileInfo getFileInfo() {
    return fileInfo;
  }
  
}
