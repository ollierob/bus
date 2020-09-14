const Chunks2JsonPlugin = require('chunks-2-json-webpack-plugin');

module.exports = {
    entry: {
        deploy: ["./src/main/js/deploy/DeployRouter.tsx"],
        manage: ["./src/main/js/manage/ManageRouter.tsx"],
    },
    output: {
        path: __dirname + "/target/classes/js",
        filename: "[name].bundle.js",
        chunkFilename: "[name].bundle.js",
    },
    devtool: "source-map",
    resolve: {
        extensions: [".ts", ".tsx", ".js", ".json", ".less"]
    },
    module: {
        rules: [
            {
                test: /\.tsx?$/,
                use: ["ts-loader"]
            },
            {
                test: /\.css$/,
                use: ["style-loader", "css-loader"]
            },
            {
                test: /\.less$/,
                use: [
                    {loader: 'style-loader'},
                    {loader: 'css-loader'},
                    {loader: 'less-loader', options: {lessOptions: {javascriptEnabled: true}}}
                ]
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
    },
    plugins: [
        new Chunks2JsonPlugin({outputDir: 'target/classes/js/'}) //Outputs manifest
    ]
}