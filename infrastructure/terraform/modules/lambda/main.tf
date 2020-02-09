resource aws_lambda_function lambda {
  description      = var.description
  handler          = var.handler
  filename         = var.filename
  source_code_hash = base64sha256(var.source_code_hash)
  function_name    = var.function_name
  publish          = true
  runtime          = var.runtime
  memory_size      = var.memory_size
  timeout          = var.timeout
  role             = var.role
  layers           = [aws_lambda_layer_version.service_layer.arn]

  environment {
    variables = var.env
  }

  tracing_config {
    mode = var.tracing_config_mode
  }
}

resource aws_lambda_layer_version service_layer {
  filename            = var.layer_filename
  layer_name          = var.layer_name
  source_code_hash    = base64sha256(var.layer_source_code_hash)
  compatible_runtimes = [var.runtime]
}