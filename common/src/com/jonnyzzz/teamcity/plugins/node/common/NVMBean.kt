/*
 * Copyright 2013-2013 Eugene Petrenko
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jonnyzzz.teamcity.plugins.node.common

/**
 * @author Eugene Petrenko (eugene.petrenko@gmail.com)
 * Date: 16.08.13 21:42
 */
public class NVMBean {
  public val NVMUsed : String = "Use_NodeJS_Install_Runner"
  public val NVMAvailable : String = "node.js.nvm"
  public val NVMFeatureType: String = "jonnyzzz.nvm"
  public val NVMVersion : String = "version"
  public val NVMSource : String = "fromSource"
  public val NVMURL : String = "fromURL"

  public val NVM_Creatonix : String = "https://github.com/creationix/nvm/archive/v0.7.0.zip"
  //"https://github.com/creationix/nvm/archive/master.zip"
}
