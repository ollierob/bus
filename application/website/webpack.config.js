module.exports = {
    entry: {
        deploy: ["./src/main/js/deploy/DeployRouter.tsx"]
    },
    output: {
        path: __dirname + "/target/classes/js",
        filename: "[name].bundle.js",
        chunkFilename: "[name].bundle.js",
    },
    devtool: "source-map",
    module: {
        rules: [
            {
                test: /\.tsx?$/,
                use: ["ts-loader"]
            },
            {
                test: /\.css$/,
                use: ["style-loader", "css-loader"]
            }
        ]
    },
    optimization: {
        splitChunks: {
            chunks: "all",
            maxInitialRequests: Infinity,
            minSize: 0,
            cacheGroups: {
                vendor: {
                    name: "vendors",
                    test: /node_modules/
                }
            }
        }
    }
}