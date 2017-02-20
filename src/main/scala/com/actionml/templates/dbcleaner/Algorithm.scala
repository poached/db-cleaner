/*
 * Copyright ActionML, LLC under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * ActionML licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.actionml.templates.dbcleaner

import org.apache.predictionio.controller.{P2LAlgorithm, Params}
import org.apache.predictionio.data.storage.NullModel
import org.apache.spark.SparkContext

import scala.language.{implicitConversions, postfixOps}

case class AlgorithmParams(appName: String) extends Params

class Algorithm(val ap: AlgorithmParams)
    extends P2LAlgorithm[PreparedData, NullModel, Query, PredictedResult] {

  def train(sc: SparkContext, data: PreparedData): NullModel = {
    new NullModel
  }

  def predict(model: NullModel, query: Query): PredictedResult = {
    PredictedResult()
  }

}